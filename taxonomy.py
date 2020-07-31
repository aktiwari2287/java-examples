import csv
import sys
def main():
    if len(sys.argv) != 3:
        sys.exit( "Usage: %s nucc_taxonomy_191.csv Taxonomy.txt" % (sys.argv[0]) )
 
    with open(sys.argv[1], mode='r') as csv_file:
        csv_reader = csv.DictReader(csv_file)
        line_count = 0
         
        outputfile = open(sys.argv[2],'w')
        for row in csv_reader:
            # Skip header line
            if line_count == 0:
                line_count += 1
            code           = 'No Code'           if row["Code"]           == '' else row["Code"]          
            grouping       = 'No Grouping'       if row["Grouping"]       == '' else row["Grouping"]      
            classification = 'No Classification' if row["Classification"] == '' else row["Classification"]
            specialization = 'No Specialization' if row["Specialization"] == '' else row["Specialization"]
            definition     = 'No Definition'     if row["Definition"]     == '' else row["Definition"]    
            notes          = 'No Notes'          if row["Notes"]          == '' else row["Notes"]         
            outputfile.write( "%s\t%s\t%s\t%s\n" % \
                     ( \
                      code \
                     ,grouping
                     ,classification \
                     ,specialization ) )
            line_count += 1
        outputfile.close()
if __name__=="__main__":
    main()