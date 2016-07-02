package week2d1.Depot;

public class Transaction {
	private Item[] items;
	private String status;
	private int id;
	private Branch fromAddress;
	private Branch currentAddress;
	private Branch toAddress;
	private MyDate transactionCreation;
	private MyDate transactionStart;
	private MyDate transactionEnd;
	private int estimationTime;
	
	public Transaction(Item[] items, String status, int id, Branch fromAddress, Branch currentAddress, Branch toAddress,
			MyDate transactionCreation, MyDate transactionStart, MyDate transactionEnd, int estimationTime) {
		this.items = items;
		this.status = status;
		this.id = id;
		this.fromAddress = fromAddress;
		this.currentAddress = currentAddress;
		this.toAddress = toAddress;
		this.transactionCreation = transactionCreation;
		this.transactionStart = transactionStart;
		this.transactionEnd = transactionEnd;
		this.estimationTime = estimationTime;
	}
	
	public MyDate getTransactionCreation() {
		return transactionCreation;
	}

	public void setTransactionCreation(MyDate transactionCreation) {
		this.transactionCreation = transactionCreation;
	}

	public MyDate getTransactionStart() {
		return transactionStart;
	}

	public void setTransactionStart(MyDate transactionStart) {
		this.transactionStart = transactionStart;
	}

	public MyDate getTransactionEnd() {
		return transactionEnd;
	}

	public void setTransactionEnd(MyDate transactionEnd) {
		this.transactionEnd = transactionEnd;
	}

	public int getEstimationTime() {
		return estimationTime;
	}

	public void setEstimationTime(int estimationTime) {
		this.estimationTime = estimationTime;
	}

	public Item[] getItems() {
		return items;
	}
	public void setItems(Item[] items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Branch getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(Branch fromAddress) {
		this.fromAddress = fromAddress;
	}
	public Branch getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Branch currentAddress) {
		this.currentAddress = currentAddress;
	}
	public Branch getToAddress() {
		return toAddress;
	}
	public void setToAddress(Branch toAddress) {
		this.toAddress = toAddress;
	}
	
}
