<?php
    echo "Hello, World!";

?>

<?php
/// Don't use strict mode
   function add($a, $b) {
       return $a + $b;
   }    

   echo add(5, "10 apples"); // Outputs 15

?>

<?php
/// Use strict mode
    declare(strict_types=1);
   function addNumer($a, $b) {
       return $a + $b;
   }    

   echo addNumer(5, "10"); // Outputs 15

?>

