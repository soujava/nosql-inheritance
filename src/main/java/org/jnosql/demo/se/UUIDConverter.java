package org.jnosql.demo.se;

import org.eclipse.jnosql.mapping.AttributeConverter;

import java.util.UUID;

public class UUIDConverter implements AttributeConverter<UUID, String> {
    @Override
    public String convertToDatabaseColumn(UUID attribute) {
        if (attribute != null) {
            return attribute.toString();
        }
        return null;
    }

    @Override
    public UUID convertToEntityAttribute(String dbData) {
        if (dbData != null) {
            return UUID.fromString(dbData);
        }
        return null;
    }
}
