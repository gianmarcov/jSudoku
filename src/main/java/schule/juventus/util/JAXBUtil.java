package schule.juventus.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBUtil {

    public static Object unmarshal(final File xmlFile, final Class<?> clazz) {
        try
        {
            final JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            return jaxbUnmarshaller.unmarshal(xmlFile);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }

        return null;
    }
}
