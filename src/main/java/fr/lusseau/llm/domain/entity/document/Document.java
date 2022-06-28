/**
 * @Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.document;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Document {

	private final DocumentId id;
	private final DocumentName name;
	private final DocumentType type;
	private final DocumentUrl url;

	public Document(DocumentBuilder builder) throws ModelValueException {
		id = new DocumentId(builder.id);
		name = new DocumentName(builder.name);
		type = new DocumentType(builder.type);
		url = new DocumentUrl(builder.url);

	}

	public static DocumentBuilder builder() {
		return new DocumentBuilder();
	}

	public static class DocumentBuilder {
		private Long id;
		private String name;
		private String type;
		private String url;

		public DocumentBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public DocumentBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public DocumentBuilder withType(String type) {
			this.type = type;
			return this;
		}

		public DocumentBuilder withUrl(String url) {
			this.url = url;
			return this;
		}

		public Document build() throws ModelValueException {
			return new Document(this);
		}
	}

	public DocumentId getId() {
		return id;
	}

	public DocumentName getName() {
		return name;
	}

	public DocumentType getType() {
		return type;
	}

	public DocumentUrl getUrl() {
		return url;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Document{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", type=").append(type);
		sb.append(", url=").append(url);
		sb.append('}');
		return sb.toString();
	}
}
