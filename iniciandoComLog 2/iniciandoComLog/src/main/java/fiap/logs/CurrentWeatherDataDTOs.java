package fiap.logs;

import java.util.List;

public class CurrentWeatherDataDTOs {

    // essa parte foi "convertida" pelo chatgpt - JSON para JAVA
    // depois disso precisa ajustar os erros - foi criada outra classe para receber esses dados
    // fazer os imports corretos
    // depois ele irá explicar o por que do 'DTOs' -> ...





    public record WeatherResponse(
            Coord coord,
            List<Weather> weather,
            String base,
            Main main,
            int visibility,
            Wind wind,
            Rain rain,
            Clouds clouds,
            long dt,
            Sys sys,
            int timezone,
            int id,
            String name,
            int cod
    ) {}

    public record Coord(
            double lon,
            double lat
    ) {}

    public record Weather(
            int id,
            String main,
            String description,
            String icon
    ) {}

    public record Main(
            double temp,
            double feels_like,
            double temp_min,
            double temp_max,
            int pressure,
            int humidity,
            int sea_level,
            int grnd_level
    ){}

    public record Wind(
            double speed,
            int deg,
            double gust
    ) {}

    public record Rain(
            double _1h
    ) {}

    public record Clouds(
            int all
    ) {}

    public record Sys(
            int type,
            int id,
            String country,
            long sunrise,
            long sunset
    ) {}
}

