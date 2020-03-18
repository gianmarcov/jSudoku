package schule.juventus.util;

import javax.xml.bind.*;
import java.io.File;

/**
 * The type Jaxb util.
 */
public class JAXBUtil {

    /**
     * unmarshal object from file.
     *
     * @param xmlFile the xml file
     * @param clazz   the clazz
     * @return object
     */
    public static Object unmarshal(final File xmlFile, final Class<?> clazz) {
        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return jaxbUnmarshaller.unmarshal(xmlFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * marshal to file.
     *
     * @param file   the file
     * @param clazz  the clazz
     * @param object the object
     */
    public static void marshal(final File file, final Class<?> clazz, final Object object) {
        try {
            final JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.marshal(object, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
