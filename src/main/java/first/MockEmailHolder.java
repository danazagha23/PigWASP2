package first;

import static org.mockito.Mockito.*;


public class MockEmailHolder {
	private  WebEmailService emailService= mock(WebEmailService.class);
	
	public MockEmailHolder(MainClass finder) {
		finder.setEmailService(emailService);
	}
	
	public WebEmailService getEmailService() {
		return emailService;
	}
	
	public void setEmailService(WebEmailService emailService) {
		this.emailService = emailService;
	}

}
