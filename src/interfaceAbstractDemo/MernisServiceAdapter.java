package interfaceAbstractDemo;
import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result= client.TCKimlikNoDogrula(customer.getNationalyId(), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		} catch (NumberFormatException e) {
			result = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		
		return result; 
	} 
	

}
