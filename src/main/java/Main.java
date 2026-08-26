import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// import com.Evento.Evento;
import com.Evento.*;

public class Main {
    public static void main(String[] args) {

        String nome = "Guilherme";
        LocalDateTime dataHora = LocalDateTime.now();
        DiaDaSemana SemanaDia = DiaDaSemana.QUARTA;
        
        Evento evento = new Evento(nome, dataHora, SemanaDia);

        evento.exibirEvento();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        dataHora = LocalDateTime.now().plusDays(5);

        System.out.println("Data do evento com +5 dias: "+dataHora.format(formatter));
    }
}
