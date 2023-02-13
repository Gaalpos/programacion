import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

class DocumentoIdentificativoTest{

    @Test
    void testGetLetter(){
        DocumentoIdentificativo doc = new DocumentoIdentificativo();
        doc.type="NIF";
        doc.text="36765546N";
        assertEquals("N", doc.getLetter());
    }

    @Test
    void testisInvalid(){
        DocumentoIdentificativo doc = new DocumentoIdentificativo();
        doc.type="CIF";
        doc.text="B34455667";
        assertEquals(true, doc.isValid());
        assertTrue(doc.isValid());
    }
}