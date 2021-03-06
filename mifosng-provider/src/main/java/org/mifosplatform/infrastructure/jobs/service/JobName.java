/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.infrastructure.jobs.service;

public enum JobName {

    UPDATE_LOAN_SUMMARY("Update loan Summary"), //
    UPDATE_LOAN_ARREARS_AGEING("Update Loan Arrears Ageing"), //
    UPDATE_LOAN_PAID_IN_ADVANCE("Update Loan Paid In Advance"), //
    APPLY_ANNUAL_FEE_FOR_SAVINGS("Apply Annual Fee For Savings"), //
    APPLY_HOLIDAYS_TO_LOANS("Apply Holidays To Loans"), //
    POST_INTEREST_FOR_SAVINGS("Post Interest For Savings"), //
    TRANSFER_FEE_CHARGE_FOR_LOANS("Transfer Fee For Loans From Savings"), //
    ACCOUNTING_RUNNING_BALANCE_UPDATE("Update Accounting Running Balances"), //
    PAY_DUE_SAVINGS_CHARGES("Pay Due Savings Charges"), //
    APPLY_CHARGE_TO_OVERDUE_LOAN_INSTALLMENT("Apply penalty to overdue loans"),
    EXECUTE_STANDING_INSTRUCTIONS("Execute Standing Instruction"),
    ADD_ACCRUAL_ENTRIES("Add Accrual Transactions"),
    UPDATE_NPA("Update Non Performing Assets"),
    UPDATE_DEPOSITS_ACCOUNT_MATURITY_DETAILS("Update Deposit Accounts Maturity details"),
    TRANSFER_INTEREST_TO_SAVINGS("Transfer Interest To Savings"),
    ADD_PERIODIC_ACCRUAL_ENTRIES("Add Periodic Accrual Transactions"),
    RECALCULATE_INTEREST_FOR_LOAN("Recalculate Interest For Loans"),
    GENERATE_RD_SCEHDULE("Generate Mandatory Savings Schedule"),
    APPY_SAVING_DEPOSITE_LATE_FEE("Apply Saving Deposite Late Fee"),
    UPDATE_CLIENT_SUB_STATUS("Update Client Sub-Status"),
    LOAN_REPAYMENT_SMS_REMINDER_TO_CLIENT("Loan Repayment Sms Reminder"),
    LOAN_FIRST_OVERDUE_REPAYMENT_REMINDER_SMS("Loan First Overdue Repayment Reminder"),
    LOAN_SECOND_OVERDUE_REPAYMENT_REMINDER_SMS("Loan Second Overdue Repayment Reminder"), 
    LOAN_THIRD_OVERDUE_REPAYMENT_REMINDER_SMS("Loan Third Overdue Repayment Reminder"),
    LOAN_FOURTH_OVERDUE_REPAYMENT_REMINDER_SMS("Loan Fourth Overdue Repayment Reminder"),
    DEFAULT_WARNING_SMS_TO_CLIENT("Default Wring Sms To Client"),
    DEFAULT_WARNING_SMS_TO_GURANTOR("Default Warning Sms To gurantor"),
    DORMANCY_WARNING_SMS_TO_CLIENT("Dormancy Warning Sms To Clients"),
    DO_INVESTMENT_DISTRIBUTION("Distribute Investment Earning");


    private final String name;

    private JobName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}