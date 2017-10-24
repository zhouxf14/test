package hugeInteger;

public class HugeInteger {
	int[] hugeInteger = new int[40];
	int digit;
	String sign;
    
	void inputHugeInteger(String str){
		int k = 0;
		if(str.substring(0,1).equals("-")){
			sign = "-";
			k = 1;
			digit = str.length() - 1;
			int start = 40 - digit;
			for (int i = 0;i<start;i++){
				hugeInteger[i] = 0;
//				System.out.print(hugeInteger[i]);
			}
			for (int i = start;i<40;i++){
				hugeInteger[i] = Integer.parseInt(str.substring(k,k+1));
				k++;					
//				System.out.print(hugeInteger[i-1]+"\r");
			}
		}else{
			sign = "";
			digit = str.length();
			int start = 40 - digit;
			for (int i = 0; i<start;i++){
				hugeInteger[i] = 0;
			}
			for (int i = start;i<40;i++){
				hugeInteger[i] = Integer.parseInt(str.substring(k,k+1));
//				System.out.print(hugeInteger[i]+"\r\n");
				k++;
			}
		}
	}
	
	void outputHugeInteger(){
		System.out.print(sign);
		int start = 40 - digit;
		for(int i = start;i<40;i++){
			System.out.print(hugeInteger[i]);
		}
		System.out.print("\r");
	}
	
	void addHugeInteger(HugeInteger plusNumber){
		int[] addition = new int[40];
		int k=0;
		if(this.sign.equals(plusNumber.sign)){
			for(int i=39;i>=0;i--){
				int add = this.hugeInteger[i] + plusNumber.hugeInteger[i] + k;
				if(add<10){
					addition[i] = add;
					k = 0;
				}else{
					addition[i] = add - 10;
					k = 1;
				}
			}
			String str = "";
			int i = 0;
			while(addition[i] == 0){
				i++;
			}
			for(int j = i;j<40;j++){
				str = str + addition[j];
			}
			HugeInteger result = new HugeInteger(str);
			result.sign = this.sign;
			result.outputHugeInteger();
		}else{
			if(this.sign.equals("-")){
				this.sign = "";
				plusNumber.subHugeInteger(this);
				this.sign = "-";
			}else{
//				plusNumber.outputHugeInteger();
//				System.out.println("aaa");
				plusNumber.sign = "";
				this.subHugeInteger(plusNumber);
				plusNumber.sign = "-";
//				plusNumber.outputHugeInteger();
//				System.out.println("bbb");
			}
		}		
	}
	
	HugeInteger sub(HugeInteger a,HugeInteger b){
		a.sign = "";
		b.sign = "";
		int[] difference = new int[40];
		int k=0;
		for(int i = 39;i>=0;i--){
			if(a.hugeInteger[i] + k >= b.hugeInteger[i]){
				difference[i] = a.hugeInteger[i] + k - b.hugeInteger[i];
				k = 0;
			}else{
				difference[i] = a.hugeInteger[i] + k +10 - b.hugeInteger[i];
				k = -1;
			}
		}	
		String str = "";
		int i = 0;
		while(difference[i] == 0){
			i++;
		}
		for(int j = i;j<40;j++){
			str = str + difference[j];
		}
//		System.out.println(str);
		HugeInteger result = new HugeInteger(str);
		result.sign = "";
		return result;
	}
		
	void subHugeInteger(HugeInteger substraction){
		HugeInteger difference;
		if(sign.equals(substraction.sign)){
			if(sign.equals("")){
				if(isGreaterThanOrEqualTo(substraction)){
					difference = sub(this, substraction);
				}else{
					difference = sub(substraction, this);
					difference.sign = "-";
				}
			}else{
				if(this.isGreaterThanOrEqualTo(substraction)){
					difference = sub(substraction,this);
				}else{
//					System.out.println("here");
					difference = sub(this,substraction);
					difference.sign = "-";				
				}
			}
			difference.outputHugeInteger();
		}else{
			if(this.sign.equals("-")){
				substraction.sign = "-";
				this.addHugeInteger(substraction);
			}else{
				substraction.sign = "";
				this.addHugeInteger(substraction);
			}
		}
	}
		
	boolean isEqualTo(HugeInteger compare){
		if(this.sign.equals(compare.sign)){
			for(int i = 39;i>=0;i--){
				if(this.hugeInteger[i] != compare.hugeInteger[i]){
					return false;
				}
			}
			return true;
		}else{
			return false;
		}
	}
	
	boolean isNotEqualTo(HugeInteger compare){
		if(this.isEqualTo(compare)){
			return false;
		}else{
			return true;
		}
	}
	
	boolean isGreaterThan(HugeInteger compare){
		if(this.sign.equals("")){
			if(compare.sign.equals("")){
				for(int i = 0;i<40;i++){
					if(this.hugeInteger[i] > compare.hugeInteger[i]){
						return true;
					}else if(this.hugeInteger[i] < compare.hugeInteger[i]){
						return false;
					}
				}
				return false;
			}else{
				return true;
			}
		}else{
			if(compare.sign.equals("-")){
				for(int i = 0;i<40;i++){
					if(this.hugeInteger[i] < compare.hugeInteger[i]){
						return true;
					}else if(this.hugeInteger[i] > compare.hugeInteger[i]){
						return false;
					}
				}
				return false;
			}else{
				return false;
			}
		}
	}
	
	boolean isLessThan(HugeInteger compare){
		if(this.isGreaterThan(compare)|this.isEqualTo(compare)){
			return false;
		}else{
			return true;
		}
	}
	
	boolean isGreaterThanOrEqualTo(HugeInteger compare){
		if(this.isGreaterThan(compare)|this.isEqualTo(compare)){
			return true;
		}else{
			return false;
		}
	}
	
	boolean isLessThanOrEqualTo(HugeInteger compare){
		if(this.isLessThan(compare)|this.isEqualTo(compare)){
			return true;
		}else{
			return false;
		}
	}
	
	HugeInteger(String str){
		inputHugeInteger(str);
	}

}
