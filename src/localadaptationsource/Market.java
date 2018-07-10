
package localadaptationsource;

public class Market {
	public String pk, apk, sox, type, test,test_prf, prod, prod_prf;
	
	public String getPk() {
		return pk;
	}
	
	public String getApk(){
		return apk;
	}
	
	public String getSox(){
		return sox;
	}
	
	public String getType(){
		return type;
	}
	
	public String getTest(){
		return test;
	}
	public String getTest_prf(){
		return test_prf;
	}
	public String getProd(){
		return prod;
	}
        public String getProd_prf(){
		return prod_prf;
	}
	
        public Market(String pk, String apk, String sox, String type,String test, String test_prf, String prod, String prod_prf){
		this.pk = pk;
		this.apk = apk;
		this.sox= sox;
		this.type = type;
		this.test = test + ".it.volvo.se";
		this.test_prf = test_prf;
		this.prod = prod + ".it.volvo.se";
                this.prod_prf = prod_prf;
	}
}

