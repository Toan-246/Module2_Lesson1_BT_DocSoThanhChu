package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số cần đọc: ");
        int number = sc.nextInt();
        String soCanDoc = "";

        switch (number){
            case 1: {
                soCanDoc = "One";
                break;
            }
            case 2: {
                soCanDoc = "Two";
                break;
            }
            case 3: {
                soCanDoc = "Three";
                break;
            }
            case 4: {
                soCanDoc = "For";
                break;
            }
            case 5: {
                soCanDoc = "Five";
                break;
            }
            case 6: {
                soCanDoc = "Six";
                break;
            }
            case 7: {
                soCanDoc = "Seven";
                break;
            }case 8: {
                soCanDoc = "Eight";
                break;
            }case 9: {
                soCanDoc = "Nine";
                break;
            }case 10: {
                soCanDoc = "Ten";
                break;
            }case 11: {
                soCanDoc = "Eleven";
                break;
            }case 12: {
                soCanDoc = "Twelve";
                break;
            }case 13: {
                soCanDoc = "Thirteen";
                break;
            }case 14: {
                soCanDoc = "Forteen";
                break;
            }case 15: {
                soCanDoc = "Fifteen";
                break;
            }case 16: {
                soCanDoc = "Sixteen";
                break;
            }case 17: {
                soCanDoc = "SevenTeen";
                break;
            }case 18: {
                soCanDoc = "Eightteen";
                break;
            }case 19: {
                soCanDoc = "Nineteen";
                break;
            }case 20: {
                soCanDoc = "Twenty";
                break;
            }
            default: {
                soCanDoc = "Không đọc dc";
            }
        }
        System.out.println("Đọc là: "+soCanDoc);
    }
}
