/**
 * Project immo-llm
 * @author
 * 2021
 */
package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.domain.address.Address;
import fr.llm.immo.domain.contract.Contract;
import fr.llm.immo.domain.document.Document;
import fr.llm.immo.domain.heat.Heat;
import fr.llm.immo.domain.propertyload.PropertyLoad;
import fr.llm.immo.domain.sort.Sort;
import fr.llm.immo.domain.tax.Tax;
import fr.llm.immo.domain.user.entity.User;
import fr.llm.immo.exception.ModelValueException;

import java.util.List;

/**
 * @author Claude LUSSEAU
 * @Project Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Housing {

	private final HousingId id;
	private final HousingName name;
	private final HousingNbRoom nbRoom;
	private final HousingSurface surface;
	private final HousingFloor floor;
	private final HousingNbLevel nbLevel;
	private final HousingAttic attic;
	private final HousingCellar cellar;
	private final HousingPool pool;
	private final HousingElevator elevator;

	private Address address;
	private Heat heat;
	private List<Tax> taxes;
	private List<PropertyLoad> propertyLoads;
	private User owner;
	private List<Contract> contracts;
	private List<Document> documents;
	private Sort sort;

	public Housing(HousingBuilder builder) throws ModelValueException {
		this.id = new HousingId(builder.id);
		this.name = new HousingName(builder.name);
		this.nbRoom = new HousingNbRoom(builder.nbRoom);
		this.surface = new HousingSurface(builder.surface);
		this.floor = new HousingFloor(builder.floor);
		this.nbLevel = new HousingNbLevel(builder.nbLevel);
		this.attic = new HousingAttic(builder.attic);
		this.cellar = new HousingCellar(builder.cellar);
		this.pool = new HousingPool(builder.pool);
		this.elevator = new HousingElevator(builder.elevator);
	}

	public static HousingBuilder builder() {
		return new HousingBuilder();
	}

	public static class HousingBuilder {
		private Long id;
		private String name;
		private Integer nbRoom;
		private Float surface;
		private Integer floor;
		private Integer nbLevel;
		private Boolean attic;
		private Boolean cellar;
		private Boolean pool;
		private Boolean elevator;

		public HousingBuilder withId(Long id){
			this.id = id;
			return this;
		}

		public HousingBuilder withName(String name){
			this.name = name;
			return this;
		}

		public HousingBuilder withNbRoom(Integer nbRoom){
			this.nbRoom = nbRoom;
			return this;
		}

		public HousingBuilder withSurface(Float surface){
			this.surface = surface;
			return this;
		}

		public HousingBuilder withFloor(Integer floor){
			this.floor = floor;
			return this;
		}

		public HousingBuilder withNbLevel(Integer nbLevel){
			this.nbLevel = nbLevel;
			return this;
		}

		public HousingBuilder withAttic(Boolean attic){
			this.attic = attic;
			return this;
		}

		public HousingBuilder withCellar(Boolean cellar){
			this.cellar = cellar;
			return this;
		}

		public HousingBuilder withPool(Boolean pool){
			this.pool = pool;
			return this;
		}

		public HousingBuilder withElevator(Boolean elevator){
			this.elevator = elevator;
			return this;
		}

		public Housing build() throws ModelValueException {
			return new Housing(this);
		}
	}

	public HousingId getId() {
		return id;
	}

	public HousingName getName() {
		return name;
	}

	public HousingNbRoom getNbRoom() {
		return nbRoom;
	}

	public HousingSurface getSurface() {
		return surface;
	}

	public HousingFloor getFloor() {
		return floor;
	}

	public HousingNbLevel getNbLevel() {
		return nbLevel;
	}

	public HousingAttic getAttic() {
		return attic;
	}

	public HousingCellar getCellar() {
		return cellar;
	}

	public HousingPool getPool() {
		return pool;
	}

	public HousingElevator getElevator() {
		return elevator;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Housing{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", nbRoom=").append(nbRoom);
		sb.append(", surface=").append(surface);
		sb.append(", floor=").append(floor);
		sb.append(", nbLevel=").append(nbLevel);
		sb.append(", attic=").append(attic);
		sb.append(", cellar=").append(cellar);
		sb.append(", pool=").append(pool);
		sb.append(", elevator=").append(elevator);
		sb.append(", address=").append(address);
		sb.append(", heat=").append(heat);
		sb.append(", taxes=").append(taxes);
		sb.append(", propertyLoads=").append(propertyLoads);
		sb.append(", owner=").append(owner);
		sb.append(", contracts=").append(contracts);
		sb.append(", documents=").append(documents);
		sb.append(", sort=").append(sort);
		sb.append('}');
		return sb.toString();
	}
}
