package soziales_nw;

public class MayBelnt {

	private int status; 
	private int data;

	public  MayBelnt(int data, int status)
	{
		this.status = status; 
		this.data = data; 
	}
public int getstatus() {
	return status; 
}


public void setStatus(int status) {
	if (status >= 1 && status <= 3)
		this.status = status;
	else 
		System.out.println("Ungültiger Status");
}

public int getData() {
	return data;
}

public void setData(int data) {
	this.data = data;
}

public void print()
{
	
	switch (status) {
	case 1:
		System.out.println("Zugriff gestattet: " + data);			
		break;
	case 2:
		System.out.println("Zugriff verweigert");
		break;
	case 3:
		System.out.println("Nicht erfasst");
		break;
	default:
		System.out.println("Ungültiger Status");
		break;
		
		
}	
	
	
}}



