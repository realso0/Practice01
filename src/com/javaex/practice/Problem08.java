package com.javaex.practice;

import java.util.Scanner;

public class Problem08 {
	private int balance;
	private int withdraw;
	private int deposit;

	Problem08() {
	}

	Problem08(int balance, int withdraw, int deposit) {
		this.balance = balance;
		this.withdraw = withdraw;
		this.deposit = deposit;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		balance -= withdraw;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		balance += deposit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Problem08 bank = new Problem08();

		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");

			System.out.print("선택>");
			int choose = sc.nextInt();

			switch (choose) {
			case 1: {
				System.out.print("예금액>");
				int deposit = sc.nextInt();
				bank.setDeposit(deposit);
				break;
			}
			case 2: {
				System.out.print("출금액>");
				int withdraw = sc.nextInt();
				bank.setWithdraw(withdraw);
				break;
			}
			case 3: {
				System.out.print("잔고액>");
				System.out.println(bank.getBalance());
				break;
			}
			case 4: {
				System.out.println("프로그램 종료");
				return;
			}
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}

	}

}
