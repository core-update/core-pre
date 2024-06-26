package org.qortal.data.account;

public class EligibleQoraHolderData {

	// Properties

	private final String address;

	private final long qoraBalance;
	private final long qortFromQoraBalance;

	private final Long finalQortFromQora;
	private final Integer finalBlockHeight;

	// Constructors

	public EligibleQoraHolderData(String address, long qoraBalance, long qortFromQoraBalance, Long finalQortFromQora,
			Integer finalBlockHeight) {
		this.address = address;
		this.qoraBalance = qoraBalance;
		this.qortFromQoraBalance = qortFromQoraBalance;
		this.finalQortFromQora = finalQortFromQora;
		this.finalBlockHeight = finalBlockHeight;
	}

	// Getters/Setters

	public String getAddress() {
		return this.address;
	}

	public long getQoraBalance() {
		return this.qoraBalance;
	}

	public long getQortFromQoraBalance() {
		return this.qortFromQoraBalance;
	}

	public Long getFinalQortFromQora() {
		return this.finalQortFromQora;
	}

	public Integer getFinalBlockHeight() {
		return this.finalBlockHeight;
	}

}
