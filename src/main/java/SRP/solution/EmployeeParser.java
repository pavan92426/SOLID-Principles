package SRP.solution;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeParser {

    public void marshalAndUnmarshall(Employee employee){
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            // serialization
            var marshalling = objectMapper.writeValueAsString(employee);
            System.out.println(marshalling);

            // Deserialization
            var unMarshall = objectMapper.readValue(marshalling, Employee.class);
            System.out.println(unMarshall);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
