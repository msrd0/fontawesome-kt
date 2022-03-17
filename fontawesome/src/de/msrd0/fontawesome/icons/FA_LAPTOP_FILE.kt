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

/** Laptop File */
object FA_LAPTOP_FILE: Icon {
	
	override val name get() = "Laptop File"
	
	override val unicode get() = "e51d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M192 96C192 113.7 206.3 128 224 128H320V192H288C243.8 192 208 227.8 208 272V384C187.1 384 169.3 397.4 162.7 416H48C21.49 416 0 394.5 0 368V48C0 21.49 21.49 0 48 0H192V96zM240 272C240 245.5 261.5 224 288 224H544C570.5 224 592 245.5 592 272V416H624C632.8 416 640 423.2 640 432V448C640 483.3 611.3 512 576 512H256C220.7 512 192 483.3 192 448V432C192 423.2 199.2 416 208 416H240V272zM304 288V416H528V288H304zM320 96H224V0L320 96z"/></svg>"""
		else -> null
	}
	
}
