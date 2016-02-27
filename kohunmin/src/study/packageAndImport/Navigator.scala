package study.packageAndImport

package bobsrockets {
  package navigation {
    
    // bobsrockets.navigation 패키지 안쪽
    class Navigator {
      // bobsrockets.navigation.StarMap 을 쓸 필요가 없다.
      val map = new StarMap
    }
    class StarMap
    
    package tests {
      // boobsrockets.navigation.tests 패키지 안쪽
      class NavigatorSuite
    }
  }
  
  class Ship {
    // bobsrockets.navigation.Navigator를 쓸 필요가 없다.
    val nav = new navigation.Navigator
  }
  
  package fleets {
    class Fleet {
      // bobsrockets.Ship 을 쓸 필요가 없다.
      def addShip() { new Ship }
    }
  }
  
}