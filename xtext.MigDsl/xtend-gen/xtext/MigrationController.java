package xtext;

import com.google.common.base.Objects;
import dsl.Column;
import dsl.DirectMapping;
import dsl.DslPackage;
import dsl.Field;
import dsl.FieldType;
import dsl.Mapping;
import dsl.Migration;
import dsl.MngCollection;
import dsl.MongoDb;
import dsl.NestingList;
import dsl.NestingObject;
import dsl.impl.DslFactoryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class MigrationController {
  public static Migration updateMigration(final Migration migration) {
    final DslFactoryImpl instance = new DslFactoryImpl();
    final MongoDb mongo = migration.getMongodb();
    EList<Mapping> _mappings = migration.getMappings();
    for (final Mapping mapping : _mappings) {
      {
        final String output = mapping.getOutput();
        final String[] parts = output.split("\\.");
        final String collection_name = parts[0];
        final String output_field = parts[1];
        EObject _create = instance.create(DslPackage.Literals.MNG_COLLECTION);
        final MngCollection newCollection = ((MngCollection) _create);
        newCollection.setName(collection_name);
        if ((mapping instanceof DirectMapping)) {
          final Function1<MngCollection, Boolean> _function = (MngCollection c) -> {
            String _name = c.getName();
            return Boolean.valueOf(Objects.equal(_name, collection_name));
          };
          final boolean collectionExists = IterableExtensions.<MngCollection>exists(mongo.getCollections(), _function);
          if ((!collectionExists)) {
            EObject _create_1 = instance.create(DslPackage.Literals.FIELD);
            final Field newField = ((Field) _create_1);
            newField.setName(output_field);
            newCollection.getFields().add(newField);
            mongo.getCollections().add(newCollection);
          } else {
            final Function1<MngCollection, Boolean> _function_1 = (MngCollection c) -> {
              String _name = c.getName();
              return Boolean.valueOf(Objects.equal(_name, collection_name));
            };
            final MngCollection existingCollection = IterableExtensions.<MngCollection>findFirst(mongo.getCollections(), _function_1);
            if ((existingCollection != null)) {
              final Function1<Field, Boolean> _function_2 = (Field f) -> {
                String _name = f.getName();
                return Boolean.valueOf(Objects.equal(_name, output_field));
              };
              final boolean fieldExists = IterableExtensions.<Field>exists(existingCollection.getFields(), _function_2);
              if ((!fieldExists)) {
                EObject _create_2 = instance.create(DslPackage.Literals.FIELD);
                final Field newField_1 = ((Field) _create_2);
                newField_1.setName(output_field);
                existingCollection.getFields().add(newField_1);
              } else {
              }
            } else {
            }
          }
        } else {
          if ((mapping instanceof NestingObject)) {
            final NestingObject mapp = ((NestingObject) mapping);
            final Function1<MngCollection, Boolean> _function_3 = (MngCollection c) -> {
              String _name = c.getName();
              return Boolean.valueOf(Objects.equal(_name, collection_name));
            };
            final boolean collectionExists_1 = IterableExtensions.<MngCollection>exists(mongo.getCollections(), _function_3);
            EList<Column> input_columns = mapp.getColumns();
            EList<Field> output_fields = mapp.getFields();
            if ((!collectionExists_1)) {
              EObject _create_3 = instance.create(DslPackage.Literals.FIELD);
              final Field newField_2 = ((Field) _create_3);
              newField_2.setName(output_field);
              int _size = output_fields.size();
              int _size_1 = input_columns.size();
              ExclusiveRange _doubleDotLessThan = new ExclusiveRange(_size, _size_1, true);
              for (final Integer i : _doubleDotLessThan) {
                {
                  EObject _create_4 = instance.create(DslPackage.Literals.FIELD);
                  final Field field = ((Field) _create_4);
                  field.setName(input_columns.get((i).intValue()).getName());
                  field.setType(FieldType.OBJECT_FIELD);
                  newField_2.getFields().add(field);
                  mapp.getFields().add(field);
                }
              }
              newCollection.getFields().add(newField_2);
              mongo.getCollections().add(newCollection);
            } else {
              final Function1<MngCollection, Boolean> _function_4 = (MngCollection c) -> {
                String _name = c.getName();
                return Boolean.valueOf(Objects.equal(_name, collection_name));
              };
              final MngCollection existingCollection_1 = IterableExtensions.<MngCollection>findFirst(mongo.getCollections(), _function_4);
              if ((existingCollection_1 != null)) {
                final Function1<Field, Boolean> _function_5 = (Field f) -> {
                  String _name = f.getName();
                  return Boolean.valueOf(Objects.equal(_name, output_field));
                };
                final boolean fieldExists_1 = IterableExtensions.<Field>exists(existingCollection_1.getFields(), _function_5);
                if ((!fieldExists_1)) {
                  EObject _create_4 = instance.create(DslPackage.Literals.FIELD);
                  final Field newField_3 = ((Field) _create_4);
                  newField_3.setName(output_field);
                  int _size_2 = output_fields.size();
                  int _size_3 = input_columns.size();
                  ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(_size_2, _size_3, true);
                  for (final Integer i_1 : _doubleDotLessThan_1) {
                    {
                      EObject _create_5 = instance.create(DslPackage.Literals.FIELD);
                      final Field field = ((Field) _create_5);
                      field.setName(input_columns.get((i_1).intValue()).getName());
                      field.setType(FieldType.OBJECT_FIELD);
                      newField_3.getFields().add(field);
                      mapp.getFields().add(field);
                    }
                  }
                  existingCollection_1.getFields().add(newField_3);
                } else {
                }
              } else {
              }
            }
          } else {
            final NestingList mapp_1 = ((NestingList) mapping);
            final Function1<MngCollection, Boolean> _function_6 = (MngCollection c) -> {
              String _name = c.getName();
              return Boolean.valueOf(Objects.equal(_name, collection_name));
            };
            final boolean collectionExists_2 = IterableExtensions.<MngCollection>exists(mongo.getCollections(), _function_6);
            EList<Column> input_columns_1 = mapp_1.getColumns();
            EList<Field> output_fields_1 = mapp_1.getFields();
            if ((!collectionExists_2)) {
              EObject _create_5 = instance.create(DslPackage.Literals.FIELD);
              final Field newField_4 = ((Field) _create_5);
              newField_4.setName(output_field);
              int _size_4 = output_fields_1.size();
              int _size_5 = input_columns_1.size();
              ExclusiveRange _doubleDotLessThan_2 = new ExclusiveRange(_size_4, _size_5, true);
              for (final Integer i_2 : _doubleDotLessThan_2) {
                {
                  EObject _create_6 = instance.create(DslPackage.Literals.FIELD);
                  final Field field = ((Field) _create_6);
                  field.setName(input_columns_1.get((i_2).intValue()).getName());
                  field.setType(FieldType.OBJECT_FIELD);
                  newField_4.getFields().add(field);
                  mapp_1.getFields().add(field);
                }
              }
              newCollection.getFields().add(newField_4);
              mongo.getCollections().add(newCollection);
            } else {
              final Function1<MngCollection, Boolean> _function_7 = (MngCollection c) -> {
                String _name = c.getName();
                return Boolean.valueOf(Objects.equal(_name, collection_name));
              };
              final MngCollection existingCollection_2 = IterableExtensions.<MngCollection>findFirst(mongo.getCollections(), _function_7);
              if ((existingCollection_2 != null)) {
                final Function1<Field, Boolean> _function_8 = (Field f) -> {
                  String _name = f.getName();
                  return Boolean.valueOf(Objects.equal(_name, output_field));
                };
                final boolean fieldExists_2 = IterableExtensions.<Field>exists(existingCollection_2.getFields(), _function_8);
                if ((!fieldExists_2)) {
                  EObject _create_6 = instance.create(DslPackage.Literals.FIELD);
                  final Field newField_5 = ((Field) _create_6);
                  newField_5.setName(output_field);
                  int _size_6 = output_fields_1.size();
                  int _size_7 = input_columns_1.size();
                  ExclusiveRange _doubleDotLessThan_3 = new ExclusiveRange(_size_6, _size_7, true);
                  for (final Integer i_3 : _doubleDotLessThan_3) {
                    {
                      EObject _create_7 = instance.create(DslPackage.Literals.FIELD);
                      final Field field = ((Field) _create_7);
                      field.setName(input_columns_1.get((i_3).intValue()).getName());
                      field.setType(FieldType.OBJECT_FIELD);
                      newField_5.getFields().add(field);
                      mapp_1.getFields().add(field);
                    }
                  }
                  existingCollection_2.getFields().add(newField_5);
                } else {
                }
              } else {
              }
            }
          }
        }
      }
    }
    migration.setMongodb(mongo);
    return migration;
  }
}
