
package Persistencia;

import Clases.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static final String USUARIOS_FILE = "data/usuarios.json";
    private static final String CITAS_FILE = "data/citas.json";
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
            .create();

    // Guardar todos los usuarios
    public static void guardarUsuarios(List<Usuario> usuarios) {
        try (FileWriter writer = new FileWriter(USUARIOS_FILE)) {
            gson.toJson(usuarios, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    // Cargar todos los usuarios
    public static List<Usuario> cargarUsuarios() {
        File file = new File(USUARIOS_FILE);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (FileReader reader = new FileReader(file)) {
            Type tipoLista = new TypeToken<ArrayList<Usuario>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Error al cargar usuarios: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // Guardar citas
    public static void guardarCitas(List<Cita> citas) {
        try (FileWriter writer = new FileWriter(CITAS_FILE)) {
            gson.toJson(citas, writer);
        } catch (IOException e) {
            System.err.println("Error al guardar citas: " + e.getMessage());
        }
    }

    // Cargar citas
    public static List<Cita> cargarCitas() {
        File file = new File(CITAS_FILE);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (FileReader reader = new FileReader(file)) {
            Type tipoLista = new TypeToken<ArrayList<Cita>>(){}.getType();
            return gson.fromJson(reader, tipoLista);
        } catch (IOException e) {
            System.err.println("Error al cargar citas: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
