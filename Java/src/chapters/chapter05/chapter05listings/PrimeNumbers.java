package chapters.chapter05.chapter05listings;

public class PrimeNumbers {
	public static void main(String[] args) {
		int primeNumCount = 0;
		int primeNum = 2;
		
		while(primeNumCount<50) {
			boolean isPrimeNum = true;
			
			for (int i = 2; i < primeNum; i++) {
				if(primeNum % i == 0) {
					isPrimeNum = false;
					break;
				}
			}
			if(isPrimeNum) {
				primeNumCount++;
				System.out.println(primeNumCount + ". prime number is: " + primeNum);
			}
			primeNum++;
		}

	}
}
