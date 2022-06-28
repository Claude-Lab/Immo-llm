/**
 * @Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.heat;

import fr.llm.immo.domain.housing.Housing;
import fr.llm.immo.exception.ModelValueException;

import java.util.List;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Heat {

	private final HeatId id;
	private final HeatName name;
	private final HeatSetup setup;

	private List<Housing> housingHeats;

	public Heat(HeatBuilder builder) throws ModelValueException {
		this.id = new HeatId(builder.id);
		this.name = new HeatName(builder.name);
		this.setup = new HeatSetup(builder.setup);
	}

	public static HeatBuilder builder() {
		return new HeatBuilder();
	}

	public static class HeatBuilder {
		private Long id;
		private String name;
		private String setup;

		public HeatBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public HeatBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public HeatBuilder withSetup(String setup) {
			this.setup = setup;
			return this;
		}

		public Heat build() throws ModelValueException {
			return new Heat(this);
		}
	}

	public HeatId getId() {
		return id;
	}

	public HeatName getName() {
		return name;
	}

	public HeatSetup getSetup() {
		return setup;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Heat{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", setup=").append(setup);
		sb.append(", housingHeats=").append(housingHeats);
		sb.append('}');
		return sb.toString();
	}
}
