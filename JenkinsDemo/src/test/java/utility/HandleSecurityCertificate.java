package utility;

import org.openqa.selenium.firefox.FirefoxProfile;

public class HandleSecurityCertificate {
	
	public static FirefoxProfile set_SecurityCertificate_Firefox(){
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(true);
		
		return profile;
	}

}
