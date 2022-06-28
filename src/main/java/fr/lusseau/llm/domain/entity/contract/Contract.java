/**
 * Project immo-llm
 * @author Claude LUSSEAU
 * 2021
 */
package fr.lusseau.llm.domain.entity.contract;

import fr.llm.immo.domain.document.Document;
import fr.llm.immo.domain.equipment.Equipment;
import fr.llm.immo.domain.housing.Housing;
import fr.llm.immo.domain.receipt.Receipt;
import fr.llm.immo.domain.user.entity.User;
import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Contract {

	private final ContractId id;
	private final ContractRent rent;
	private final ContractRentLoad rentLoad;
	private final ContractStartDate startDate;
	private final ContractEndDate endDate;
	private final ContractSecurityDeposit securityDeposit;
	private final ContractName name;

	private List<Receipt> receipts;
	private List<User> tenants;
	private Housing housing;
	private List<Equipment> equipments;
	private List<Document> files;

	public Contract(ContractBuilder builder) throws ModelValueException {
		this.id = new ContractId(builder.id);
		this.rent = new ContractRent(builder.rent);
		this.rentLoad = new ContractRentLoad(builder.rentLoad);
		this.startDate = new ContractStartDate(builder.startDate);
		this.endDate = new ContractEndDate(builder.endDate);
		this.securityDeposit = new ContractSecurityDeposit(builder.securityDeposit);
		this.name = new ContractName(builder.name);
	}

	public static ContractBuilder builder() {
		return new ContractBuilder();
	}

	public static class ContractBuilder {
		private Long id;
		private Float rent;
		private Float rentLoad;
		private LocalDate startDate;
		private LocalDate endDate;
		private Float securityDeposit;
		private String name;

		public ContractBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public ContractBuilder withRent(Float rent) {
			this.rent = rent;
			return this;
		}

		public ContractBuilder withRentLoad(Float rentLoad) {
			this.rentLoad = rentLoad;
			return this;
		}

		public ContractBuilder withStartDate(LocalDate startDate) {
			this.startDate = startDate;
			return this;
		}

		public ContractBuilder withEndDate(LocalDate endDate) {
			this.endDate = endDate;
			return this;
		}

		public ContractBuilder withSecurityDeposit(Float securityDeposit) {
			this.securityDeposit = securityDeposit;
			return this;
		}

		public ContractBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public Contract build() throws ModelValueException {
			return new Contract(this);
		}
	}

	public ContractId getId() {
		return id;
	}

	public ContractRent getRent() {
		return rent;
	}

	public ContractRentLoad getRentLoad() {
		return rentLoad;
	}

	public ContractStartDate getStartDate() {
		return startDate;
	}

	public ContractEndDate getEndDate() {
		return endDate;
	}

	public ContractSecurityDeposit getSecurityDeposit() {
		return securityDeposit;
	}

	public ContractName getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Contract{");
		sb.append("id=").append(id);
		sb.append(", rent=").append(rent);
		sb.append(", rentLoad=").append(rentLoad);
		sb.append(", startDate=").append(startDate);
		sb.append(", endDate=").append(endDate);
		sb.append(", securityDeposit=").append(securityDeposit);
		sb.append(", name=").append(name);
		sb.append(", receipts=").append(receipts);
		sb.append(", tenants=").append(tenants);
		sb.append(", housing=").append(housing);
		sb.append(", equipments=").append(equipments);
		sb.append(", files=").append(files);
		sb.append('}');
		return sb.toString();
	}
}
