/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Practica01.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
/**
 *
 * @author Jonathan
 */
@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    // El BucketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "fide-448c2.appspot.com";

    // Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "practica";

    // Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    // El nombre del archivo Json
    final String archivoJsonFile = "fide-448c2-firebase-adminsdk-xenpk-31e0c3a7f5.json";
}