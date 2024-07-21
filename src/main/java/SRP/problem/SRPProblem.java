package SRP.problem;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/* Aim for high cohesion and loosely coupled */
@Slf4j
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SRPProblem {

    private String fName;
    private String lName;
    private String email;
    private String idNum;
    private String empType;


    public void marshalAndUnmarshall(){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // serialization
            var marshalling = objectMapper.writeValueAsString(this);
            System.out.println(marshalling);

            // Deserialization
            var unMarshall = objectMapper.readValue(marshalling, SRPProblem.class);
            System.out.println(unMarshall);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }

    public int employeeStatus() {
        if(empType=="FULL TIME"){
            return 100;
        } else if (empType == "PART TIME"){
            return 50;
        }
        return 0;
    }

}

