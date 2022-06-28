/**
 * Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.receipt;

import fr.llm.immo.domain.contract.Contract;
import fr.llm.immo.domain.document.Document;
import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;
import java.util.List;


/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Receipt {

	private final ReceiptId id;
	private final ReceiptName name;
	private final ReceiptDate issueDate;
	private final ReceiptRental rental;
	private final ReceiptRentalLoad rentalLoad;

	private Contract contract;
	private List<Document> receiptFiles;

	public Receipt(ReceiptBuilder builder) throws ModelValueException {
		this.id = new ReceiptId(builder.id);
		this.name = new ReceiptName(builder.name);
		this.issueDate = new ReceiptDate(builder.issueDate);
		this.rental = new ReceiptRental(builder.rental);
		this.rentalLoad = new ReceiptRentalLoad(builder.rentalLoad);
	}

	public static ReceiptBuilder builder() {
		return new ReceiptBuilder();
	}

	public static class ReceiptBuilder {
		private Long id;
		private String name;
		private LocalDate issueDate;
		private Float rental;
		private Float rentalLoad;

		public ReceiptBuilder withId(Long id) {
			this.id = id;
			return this;
		}

		public ReceiptBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public ReceiptBuilder withIssueDate(LocalDate issueDate) {
			this.issueDate = issueDate;
			return this;
		}

		public ReceiptBuilder withRental(Float rental) {
			this.rental = rental;
			return this;
		}

		public ReceiptBuilder withRentalLoad(Float rentalLoad) {
			this.rentalLoad = rentalLoad;
			return this;
		}

		public Receipt build() throws ModelValueException {
			return new Receipt(this);
		}
	}

	public ReceiptId getId() {
		return id;
	}

	public ReceiptName getName() {
		return name;
	}

	public ReceiptDate getIssueDate() {
		return issueDate;
	}

	public ReceiptRental getRental() {
		return rental;
	}

	public ReceiptRentalLoad getRentalLoad() {
		return rentalLoad;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Receipt{");
		sb.append("id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", issueDate=").append(issueDate);
		sb.append(", rental=").append(rental);
		sb.append(", rentalLoad=").append(rentalLoad);
		sb.append(", contract=").append(contract);
		sb.append(", receiptFiles=").append(receiptFiles);
		sb.append('}');
		return sb.toString();
	}
}
