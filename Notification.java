public interface Notification {
    import java.util.List;

public class NotificationService {
    private List<NotificationChannel> channels;

    public NotificationService(List<NotificationChannel> channels) {
        this.channels = channels;
    }

    public void notifyCustomer(String recipient, String message) {
        for (NotificationChannel channel : channels) {
            channel.send(recipient, message);
        }
    }
}
Singleton GatewayConfig
public class GatewayConfig {
    private static GatewayConfig instance;

    private String smsGatewayUrl;
    private String emailServer;
    private String pushApiKey;
    private String whatsappGatewayUrl;

    private GatewayConfig() {
        smsGatewayUrl = "https://sms.pesalink.ug";
        emailServer = "mail.pesalink.ug";
        pushApiKey = "default-push-key";
        whatsappGatewayUrl = "https://whatsapp.pesalink.ug";
    }

    public static GatewayConfig getInstance() {
        if (instance == null) {
            instance = new GatewayConfig();
        }

        return instance;
    }

    public String getSmsGatewayUrl() {
        return smsGatewayUrl;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public String getPushApiKey() {
        return pushApiKey;
    }

    public String getWhatsappGatewayUrl() {
        return whatsappGatewayUrl;
    }
}

}
