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

/** House Circle-exclamation */
object FA_HOUSE_CIRCLE_EXCLAMATION: Icon {
	
	override val name get() = "House Circle-exclamation"
	
	override val unicode get() = "e50a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M320 352H256C238.3 352 224 366.3 224 384V472C224 494.1 206.1 512 184 512H128.1C126.6 512 125.1 511.9 123.6 511.8C122.4 511.9 121.2 512 120 512H104C81.91 512 64 494.1 64 472V360C64 359.1 64.03 358.1 64.09 357.2V287.6H32.05C14.02 287.6 0 273.5 0 255.5C0 246.5 3.004 238.5 10.01 231.5L266.4 8.016C273.4 1.002 281.4 0 288.4 0C295.4 0 303.4 2.004 309.5 7.014L522.1 193.9C513.6 192.7 504.9 192 496 192C404.2 192 328.8 262.3 320.7 352L320 352zM352 368C352 288.5 416.5 224 496 224C575.5 224 640 288.5 640 368C640 447.5 575.5 512 496 512C416.5 512 352 447.5 352 368zM496 464C509.3 464 520 453.3 520 440C520 426.7 509.3 416 496 416C482.7 416 472 426.7 472 440C472 453.3 482.7 464 496 464zM479.1 288V368C479.1 376.8 487.2 384 495.1 384C504.8 384 511.1 376.8 511.1 368V288C511.1 279.2 504.8 272 495.1 272C487.2 272 479.1 279.2 479.1 288z"/></svg>"""
		else -> null
	}
	
}
