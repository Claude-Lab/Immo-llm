/**
 * @Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.type;


import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class Type {

	private final TypeId id;
	private final TypeName name;

	public Type(TypeBuilder builder) throws ModelValueException {
		this.id = new TypeId(builder.id);
		this.name = new TypeName(builder.name);
	}

	public static TypeBuilder builder() {
		return new TypeBuilder();
	}

	public static class TypeBuilder {
		private Long id;
		private String name;

		public TypeBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public TypeBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public Type build() throws ModelValueException {
			return new Type(this);
		}
	}

	public TypeId getId() {
		return id;
	}

	public TypeName getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Type{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append('}');
		return sb.toString();
	}
}
