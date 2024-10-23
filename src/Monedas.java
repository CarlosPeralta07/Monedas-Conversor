import java.util.Map;

public record Monedas(double conversion_rate,
                      String base_code,
                      String target_code) {
}
