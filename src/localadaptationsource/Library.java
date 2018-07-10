
package localadaptationsource;


public class Library {

	public String pk, type, library, file, test_prod;
	
	public String getPk() {
		return pk;
	}
	
	public String getType(){
		return type;
	}
	
	public String getLibrary(){
		return library;
	}
	
	public String getFile(){
		return file;
	}
	
	
	public Library(String pk, String type, String library, String file, String test_prod){
		this.pk = pk;
		this.type = type;
		this.library = library;
		this.file = file;
                this.test_prod = test_prod;
		
	}
    
}
