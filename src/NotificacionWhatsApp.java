public class NotificacionWhatsApp extends Notificacion{

    protected NotificacionWhatsApp(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envío el mensaje \"" + mensaje + "\" por WhatsApp a: " + receptorNotificacion);
    }
}