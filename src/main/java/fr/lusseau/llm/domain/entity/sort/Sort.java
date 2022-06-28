/**
 * @Project Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.sort;

import fr.llm.immo.exception.ModelValueException;


/**
 * @author Claude LUSSEAU
 * @Project Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Sort {

	private final SortId id;
	private final SortName name;

	public Sort(SortBuilder builder) throws ModelValueException {
		this.id = new SortId(builder.id);
		this.name = new SortName(builder.name);
	}

	public static SortBuilder builder() {
		return new SortBuilder();
	}

	public static class SortBuilder {
		private Long id;
		private String name;

		public SortBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public SortBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public Sort build() throws ModelValueException {
			return new Sort(this);
		}
	}

	public SortId getId() {
		return id;
	}

	public SortName getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Sort{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append('}');
		return sb.toString();
	}
}
