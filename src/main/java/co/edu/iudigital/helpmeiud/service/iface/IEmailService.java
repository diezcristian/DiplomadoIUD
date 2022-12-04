package co.edu.iudigital.helpmeiud.service.iface;

public interface IEmailService {
    public boolean sendEmail(String message, String to, String subject);

}
