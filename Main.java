/********************************************
*	AUTHORS:	<your names>
* COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
*	LAST MODIFIED:	<date of last change>
********************************************/

/********************************************
*	<TITLE OF PROGRAM>
*********************************************
*	PROGRAM DESCRIPTION:
*	<1-2 sentences describing overall program>
*********************************************
*	ALGORITHM:
*	<Pseudocode here>
*********************************************
*	STATIC METHODS:
* <UML style list of static methods>
*********************************************/


public class Main 
{
  /***** CONSTANT SECTION *****/

  public static void main(String[] args)
  {
    /********************************************
     *   AUTHORS:   <Jackson Loeffler, Keyan Zokaie, Qaseem Yousag, Michael Forbes>
     * COLLABORATORS: <name of peer, tutor, instructor, anyone else who helped>
     *   LAST MODIFIED: <date of last change>
     ********************************************/


    /********************************************
     *   <Avg>
     *********************************************
     *   PROGRAM DESCRIPTION:
     *   <Wealthy disparity calculator>
     *********************************************
     *   ALGORITHM:
     *   <Pseudocode here>
     *********************************************
     *   STATIC METHODS:
     * <UML style list of static methods>
     *********************************************/

/**This code was made as a wealth disparity calculator.
 made to show the difference in wealth status and poverty
 status in different countries around the world using the US dollar as a baseline.
 I then calculate the different poverty rates and wealth rates of each country.

 */

    public class Main
    {
      /***** CONSTANT SECTION *****/
      static final String CURRENCY = "USD";
      static final String PROGRAM_NAME = "Wealth disparity Analyzer"
      public static void main(String[] args)
      {

        {
          /***** DECLARATION SECTION *****/
          String[] countries = {"Germany", "Canada", "Japan"};

          double[] averageWealth = {256000.0, 520000.0, 211846.0};
          double[] medianWealth = {106000.0, 338000.0, 83843.0};
          double[] topOnePercentShare = {28.0, 28.0, 30.0};
          double[] povertyRate = {16.6, 10.6, 15.4};

          int[] population = {84000000, 41400000, 122400000};
          int[] unemployedPopulation = {4800000, 1482400, 2500000};





          /***** INITIALIZATION SECTION *****/








          /***** OUTPUT SECTION *****/
          for (int i = 0; i < countries.length; i++) {

            double ratio = calculateTopOnePercentToPovertyRatio(
                    topOnePercentShare[i], povertyRate[i]);

            double unemployment = calculateUnemploymentRate(
                    population[i], unemployedPopulation[i]);

            System.out.println("Country: " + countries[i]);
            System.out.println("---------------------------------------");
            System.out.println("Average Wealth: " + averageWealth[i] + " " + CURRENCY);
            System.out.println("Median Wealth: " + medianWealth[i] + " " + CURRENCY);
            System.out.println("Population: " + population[i]);
            System.out.println("Top 1% Wealth Share: " + topOnePercentShare[i] + "%");
            System.out.println("Poverty Rate: " + povertyRate[i] + "%");
            System.out.println("Unemployment Rate: " + unemployment + "%");
            System.out.println("Top 1% to Poverty Ratio: " + ratio);

            if (unemployment < 5) {
              System.out.println("Employment Status: Low unemployment");
            } else {
              System.out.println("Employment Status: High unemployment");
            }

            System.out.println();
          }








        } }

      private static double calculateUnemploymentRate(int population, int unemployedPopulation) {
      }

      private static double calculateTopOnePercentToPovertyRatio(double topOnePercentShare, double povertyRate) {
      }
    
  }

}
