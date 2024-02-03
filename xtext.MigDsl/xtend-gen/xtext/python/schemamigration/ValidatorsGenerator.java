package xtext.python.schemamigration;

import dsl.Column;
import dsl.Field;
import dsl.Migration;
import dsl.MngCollection;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;
import xtext.Utils;
import xtext.oracle.DataTypeFetcher;

@SuppressWarnings("all")
public class ValidatorsGenerator {
  public CharSequence getValidatorForCollection(final MngCollection collection, final Migration migration) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("collectionValidator = {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\'$jsonSchema\': {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\'type\': \'object\',");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\'properties\': {");
    _builder.newLine();
    {
      int _size = collection.getFields().size();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
      for(final Integer i : _doubleDotLessThan) {
        {
          int _size_1 = collection.getFields().get((i).intValue()).getFields().size();
          boolean _equals = (_size_1 == 0);
          if (_equals) {
            _builder.append("\t\t\t");
            _builder.append("\'");
            String _name = collection.getFields().get((i).intValue()).getName();
            _builder.append(_name, "\t\t\t");
            _builder.append("\': {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("\t");
            {
              boolean _isDataTypeMigration = migration.getOptions().isDataTypeMigration();
              if (_isDataTypeMigration) {
                CharSequence _dataType = this.getDataType(collection.getFields().get((i).intValue()), migration);
                _builder.append(_dataType, "\t\t\t\t");
              }
            }
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t");
            _builder.append("}");
            {
              int _length = ((Object[])Conversions.unwrapArray(collection.getFields(), Object.class)).length;
              int _minus = (_length - 1);
              boolean _notEquals = ((i).intValue() != _minus);
              if (_notEquals) {
                _builder.append(",");
              }
            }
            _builder.newLineIfNotEmpty();
          } else {
            _builder.append("\t\t\t");
            CharSequence _objectProperties = this.getObjectProperties(collection.getFields().get((i).intValue()), migration);
            _builder.append(_objectProperties, "\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("}");
    CharSequence _requiredFields = this.getRequiredFields(collection, migration);
    _builder.append(_requiredFields, "\t\t");
    {
      boolean _isAllowAdditionalFields = migration.getOptions().isAllowAdditionalFields();
      boolean _not = (!_isAllowAdditionalFields);
      if (_not) {
        _builder.append(",");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\'additionalProperties\': False");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("database.create_collection(\'");
    String _name_1 = collection.getName();
    _builder.append(_name_1);
    _builder.append("\')");
    _builder.newLineIfNotEmpty();
    _builder.append("database.command(\"collMod\", \"");
    String _name_2 = collection.getName();
    _builder.append(_name_2);
    _builder.append("\",validator=collectionValidator)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence getObjectProperties(final Field field, final Migration mig) {
    CharSequence _xblockexpression = null;
    {
      InputOutput.<String>println("Funkcija je pozvana jednom");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\'");
      String _name = field.getName();
      _builder.append(_name);
      _builder.append("\':{");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("\'type\': \'object\',");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("\'properties\':{");
      _builder.newLine();
      {
        int _size = field.getFields().size();
        ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
        for(final Integer i : _doubleDotLessThan) {
          {
            int _size_1 = field.getFields().get((i).intValue()).getFields().size();
            boolean _equals = (_size_1 == 0);
            if (_equals) {
              _builder.append("\t\t");
              _builder.append("\'");
              String _name_1 = field.getFields().get((i).intValue()).getName();
              _builder.append(_name_1, "\t\t");
              _builder.append("\': {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("\t");
              {
                boolean _isDataTypeMigration = mig.getOptions().isDataTypeMigration();
                if (_isDataTypeMigration) {
                  CharSequence _dataType = this.getDataType(field.getFields().get((i).intValue()), mig);
                  _builder.append(_dataType, "\t\t\t");
                }
              }
              _builder.newLineIfNotEmpty();
              _builder.append("\t\t");
              _builder.append("}");
              {
                int _length = ((Object[])Conversions.unwrapArray(field.getFields(), Object.class)).length;
                int _minus = (_length - 1);
                boolean _notEquals = ((i).intValue() != _minus);
                if (_notEquals) {
                  _builder.append(",");
                }
              }
              _builder.newLineIfNotEmpty();
            } else {
              _builder.append("\t\t");
              Object _objectProperties = this.getObjectProperties(field.getFields().get((i).intValue()), mig);
              _builder.append(_objectProperties, "\t\t");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
      _builder.append("\t");
      _builder.append("}");
      CharSequence _requiredFieldsForObject = this.requiredFieldsForObject(field, mig);
      _builder.append(_requiredFieldsForObject, "\t");
      {
        boolean _isAllowAdditionalFields = mig.getOptions().isAllowAdditionalFields();
        boolean _not = (!_isAllowAdditionalFields);
        if (_not) {
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("\'additionalProperties\': False");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence getRequiredFields(final MngCollection collection, final Migration migration) {
    CharSequence _xblockexpression = null;
    {
      final List<String> required = ConstraintUtils.getRequiredFieldsForCollection(collection, migration);
      StringConcatenation _builder = new StringConcatenation();
      {
        int _length = ((Object[])Conversions.unwrapArray(required, Object.class)).length;
        boolean _notEquals = (_length != 0);
        if (_notEquals) {
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\'required\':[");
          {
            int _size = required.size();
            ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
            for(final Integer i : _doubleDotLessThan) {
              _builder.append("\'");
              String _get = required.get((i).intValue());
              _builder.append(_get);
              _builder.append("\'");
              {
                int _length_1 = ((Object[])Conversions.unwrapArray(required, Object.class)).length;
                int _minus = (_length_1 - 1);
                boolean _notEquals_1 = ((i).intValue() != _minus);
                if (_notEquals_1) {
                  _builder.append(",");
                }
              }
            }
          }
          _builder.append("]");
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence requiredFieldsForObject(final Field field, final Migration migration) {
    CharSequence _xblockexpression = null;
    {
      final List<String> required = ConstraintUtils.getRequiredFieldsForObject(field, migration);
      StringConcatenation _builder = new StringConcatenation();
      {
        int _length = ((Object[])Conversions.unwrapArray(required, Object.class)).length;
        boolean _notEquals = (_length != 0);
        if (_notEquals) {
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\'required\':[");
          {
            int _size = required.size();
            ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
            for(final Integer i : _doubleDotLessThan) {
              _builder.append("\'");
              String _get = required.get((i).intValue());
              _builder.append(_get);
              _builder.append("\'");
              {
                int _length_1 = ((Object[])Conversions.unwrapArray(required, Object.class)).length;
                int _minus = (_length_1 - 1);
                boolean _notEquals_1 = ((i).intValue() != _minus);
                if (_notEquals_1) {
                  _builder.append(",");
                }
              }
            }
          }
          _builder.append("]");
        }
      }
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public CharSequence getDataType(final Field field, final Migration migration) {
    CharSequence _xblockexpression = null;
    {
      DataTypeFetcher fetcher = new DataTypeFetcher();
      final Column sourceColumn = Utils.getSourceColumnForField(field, migration);
      String oracleType = fetcher.getColumnDataType(
        Utils.getTableNameFromReferencedColumn(migration.getRelationaldb(), sourceColumn), sourceColumn.getName(), migration.getRelationaldb());
      final String mongoType = fetcher.getMongoDataType(oracleType);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\'type\': \'");
      _builder.append(mongoType);
      _builder.append("\'");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}
