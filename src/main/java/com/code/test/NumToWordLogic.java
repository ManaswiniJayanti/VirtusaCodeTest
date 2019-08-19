package com.code.test;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class NumToWordLogic {
	
	public String numToWordConverter(String givenNumber){
		String finalWord = "";
		int count = givenNumber.length()%3;
		int setCount = givenNumber.length()/3;

		int totalSets = (count >0)? setCount+1 : setCount;
		int totalSetsDup = 0;
		
		try{

		if(count >0){
			String firstSet = givenNumber.substring(0, count);
			finalWord  = getWordForGivenNumber(firstSet,totalSets);
			totalSetsDup = totalSets-1;
		}else{
			totalSetsDup = totalSets; 
		}
		
		
		for(int i= totalSetsDup; i >0; i --){
			finalWord += " "+getWordForGivenNumber(givenNumber.substring(count, count+3),i);
			count = count +3;
		}
		}catch(ArrayIndexOutOfBoundsException arrayEx){
			arrayEx.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return finalWord;

	}
	
	private String getWordForGivenNumber(String subStr, int setCount){
		String wordToBeReturned = "";
		if(subStr.length() == 1){
			wordToBeReturned = getBritishWordForNumber(subStr);
		}else if(subStr.length() == 2){
			if(subStr.charAt(0) == '1'){
				wordToBeReturned = getBritishWordForNumber(subStr);
			}else {
				wordToBeReturned = getTwoDigitWordConverter(subStr, wordToBeReturned);
			}
		}else{
			wordToBeReturned = getThreeDigitWordConverter(subStr, wordToBeReturned);
		}

		wordToBeReturned += (!"".equals(wordToBeReturned)) ? (" "+getWordFromSetsCount(String.valueOf(setCount))) : "";

		return wordToBeReturned;
	}
	
	
	private String getThreeDigitWordConverter(String givenStr,String tobeReturned){
		tobeReturned += getBritishWordForNumber(String.valueOf(givenStr.charAt(0)));
		if(!"0".equals(String.valueOf(givenStr.charAt(0)))){
			tobeReturned += " Hundred ";
			if(!"00".equals(givenStr.substring(1))){
				tobeReturned += "and ";
			}else{
				tobeReturned += "";
			}
		}else{
			tobeReturned += "";
		}
		tobeReturned += getTwoDigitWordConverter(givenStr.substring(1),tobeReturned);

		return tobeReturned;

	}
	
	private String getTwoDigitWordConverter(String givenStr,String tobeReturned){
		String tensPlace = String.valueOf(givenStr.charAt(0));
		if(!"1".equals(tensPlace)){
			tobeReturned =  getTensPlace(String.valueOf(givenStr.charAt(0)));
			tobeReturned += getBritishWordForNumber(String.valueOf(givenStr.charAt(1)));
		}else{
			tobeReturned =  getBritishWordForNumber(givenStr);
		}

		return tobeReturned;
	}
	
	public static void main(String args[]){
		NumToWordLogic numObj = new NumToWordLogic();
		System.out.println("Final Word ::"+numObj.numToWordConverter("1001"));
	}
	
	public String getBritishWordForNumber(String numStr){
		String numberToWord = null;
		switch(numStr){
		case "1":
			numberToWord = "One";
			break;
		case "2":
			numberToWord = "Two";
			break;
		case "3":
			numberToWord = "Three";
			break;
		case "4":
			numberToWord = "Four";
			break;
		case "5":
			numberToWord = "Five";
			break;
		case "6":
			numberToWord = "Six";
			break;
		case "7":
			numberToWord = "Seven";
			break;
		case "8":
			numberToWord = "Eight";
			break;
		case "9":
			numberToWord = "Nine";
			break;
		case "10":
			numberToWord = "Ten";
			break;
		case "11":
			numberToWord = "Eleven";
			break;
		case "12":
			numberToWord = "Twelve";
			break;
		case "13":
			numberToWord = "Thirteen";
			break;
		case "14":
			numberToWord = "Fourteen";
			break;
		case "15":
			numberToWord = "Fifteen";
			break;
		case "16":
			numberToWord = "Sixteen";
			break;
		case "17":
			numberToWord = "Seventeen";
			break;
		case "18":
			numberToWord = "Eighteen";
			break;
		case "19":
			numberToWord = "Nineteen";
			break;
		case "01":
			numberToWord = "One";
			break;
		case "02":
			numberToWord = "Two";
			break;
		case "03":
			numberToWord = "Three";
			break;
		case "04":
			numberToWord = "Four";
			break;
		case "05":
			numberToWord = "Five";
			break;
		case "06":
			numberToWord = "Six";
			break;
		case "07":
			numberToWord = "Seven";
			break;
		case "08":
			numberToWord = "Eight";
			break;
		case "09":
			numberToWord = "Nine";
			break;
		default :
			numberToWord = "";
			break;
		}
		return numberToWord;
	}
	
	
	public String getTensPlace(String numStr){
		String wordInTensPlace = null;
		switch(numStr){
		case "2":
			wordInTensPlace = "Twenty";
			break;
		case "3":
			wordInTensPlace = "Thirty";
			break;
		case "4":
			wordInTensPlace = "Forty";
			break;
		case "5":
			wordInTensPlace = "Fifty";
			break;
		case "6":
			wordInTensPlace = "Sixty";
			break;
		case "7":
			wordInTensPlace = "Seventy";
			break;
		case "8":
			wordInTensPlace = "Eighty";
			break;
		case "9":
			wordInTensPlace = "Ninety";
			break;
		default :
			wordInTensPlace = "";
		}
		return wordInTensPlace;
	}
	
	
	public String getWordFromSetsCount(String setCount){
		String wordForSetCount = null;
		switch(setCount){
		case "2" : 
			wordForSetCount = "Thousand";
			break;
		case "3" : 
			wordForSetCount = "Million";
			break;
		case "4" : 
			wordForSetCount = "Billion";
			break;
		case "5" : 
			wordForSetCount = "Trillion";
			break;
		default : 
			wordForSetCount = "";
			break;
		}
		return wordForSetCount;
	}
	

}
