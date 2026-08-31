import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import com.Evento.Evento;
import com.Evento.*;

class Main {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        Evento evento = new Evento("Workshop de Java", agora, DiaDaSemana.QUARTA);
        
        System.out.println("=== EVENTO ORIGINAL ===");
        evento.exibirEvento();
        
        evento.adicionarDias(5);
        System.out.println("\n=== APÓS ADICIONAR 5 DIAS ===");
        evento.exibirEvento();
        
        System.out.println("\n=== CONVERSÃO DE FUSOS ===");
        evento.exibirFuso("America/Sao_Paulo");
        evento.exibirFuso("GMT");
    }
}
