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

/** Truck Field */
object FA_TRUCK_FIELD: Icon {
	
	override val name get() = "Truck Field"
	
	override val unicode get() = "e58d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M32 96C32 60.65 60.65 32 96 32H320C343.7 32 364.4 44.87 375.4 64H427.2C452.5 64 475.4 78.9 485.7 102L538.5 220.8C538.1 221.9 539.4 222.9 539.8 223.1H544C579.3 223.1 608 252.7 608 287.1V319.1C625.7 319.1 640 334.3 640 352C640 369.7 625.7 384 608 384H576C576 437 533 480 480 480C426.1 480 384 437 384 384H256C256 437 213 480 160 480C106.1 480 64 437 64 384H32C14.33 384 0 369.7 0 352C0 334.3 14.33 319.1 32 319.1V287.1C14.33 287.1 0 273.7 0 255.1V159.1C0 142.3 14.33 127.1 32 127.1V96zM469.9 224L427.2 128H384V224H469.9zM160 432C186.5 432 208 410.5 208 384C208 357.5 186.5 336 160 336C133.5 336 112 357.5 112 384C112 410.5 133.5 432 160 432zM480 336C453.5 336 432 357.5 432 384C432 410.5 453.5 432 480 432C506.5 432 528 410.5 528 384C528 357.5 506.5 336 480 336z"/></svg>"""
		else -> null
	}
	
}
