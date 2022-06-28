/**
 * @Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.state;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class State {

	private StateId id;
	private StateName name;

	public State(StateBuilder builder) throws ModelValueException {
		this.id = new StateId(builder.id);
		this.name = new StateName(builder.name);
	}

	public static StateBuilder builder() {
		return new StateBuilder();
	}

	public static class StateBuilder {
		private Long id;
		private String name;

		public StateBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public StateBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public State build() throws ModelValueException {
			return new State(this);
		}
	}

	public StateId getId() {
		return id;
	}

	public StateName getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("State{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append('}');
		return sb.toString();
	}
}
