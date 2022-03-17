/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Mountain City */
object FA_MOUNTAIN_CITY: Icon {
	
	override val name get() = "Mountain City"
	
	override val unicode get() = "e52e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M432 0C458.5 0 480 21.49 480 48V192H520V120C520 106.7 530.7 96 544 96C557.3 96 568 106.7 568 120V192H592C618.5 192 640 213.5 640 240V464C640 490.5 618.5 512 592 512H470.2C470.7 511.2 471.2 510.5 471.6 509.7C483.2 488.6 482.8 462.9 470.3 442.4L396.5 320H400C408.8 320 416 312.8 416 304V272C416 263.2 408.8 256 400 256H368C364.8 256 361.9 256.9 359.4 258.5L288 140.1V48C288 21.49 309.5 0 336 0L432 0zM368 64C359.2 64 352 71.16 352 80V112C352 120.8 359.2 128 368 128H400C408.8 128 416 120.8 416 112V80C416 71.16 408.8 64 400 64H368zM352 208C352 216.8 359.2 224 368 224H400C408.8 224 416 216.8 416 208V176C416 167.2 408.8 160 400 160H368C359.2 160 352 167.2 352 176V208zM512 304C512 312.8 519.2 320 528 320H560C568.8 320 576 312.8 576 304V272C576 263.2 568.8 256 560 256H528C519.2 256 512 263.2 512 272V304zM528 352C519.2 352 512 359.2 512 368V400C512 408.8 519.2 416 528 416H560C568.8 416 576 408.8 576 400V368C576 359.2 568.8 352 560 352H528zM442.9 458.9C449.4 469.7 449.7 483.2 443.6 494.2C437.5 505.2 426 512 413.5 512H34.46C21.1 512 10.5 505.2 4.404 494.2C-1.693 483.2-1.444 469.7 5.056 458.9L194.6 144.7C200.9 134.3 211.1 128 224 128C236 128 247.1 134.3 253.4 144.7L442.9 458.9zM223.1 188.9L150.4 310.8L174.1 352L222.1 288H283.8L223.1 188.9z"/></svg>"""
		else -> null
	}
	
}
