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

object FA_FLASK_AND_VIAL: Icon {
	
	override val name get() = "Flask and Vial"
	
	override val unicode get() = "e4f3"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M160 442.5C149.1 446.1 139.2 448 128 448C74.98 448 32 405 32 352V64C14.33 64 0 49.67 0 32C0 14.33 14.33 0 32 0H224C241.7 0 256 14.33 256 32C256 49.67 241.7 64 224 64V309.9L175 389.4C165.2 405.4 160 423.8 160 442.5zM96 160H160V64H96V160zM512 0C529.7 0 544 14.33 544 32C544 49.67 529.7 64 512 64V214.9L629.7 406.2C636.4 417.2 640 429.7 640 442.6C640 480.9 608.9 512 570.6 512H261.4C223.1 512 191.1 480.9 191.1 442.6C191.1 429.7 195.6 417.2 202.3 406.2L319.1 214.9V64C302.3 64 287.1 49.67 287.1 32C287.1 14.33 302.3 0 319.1 0L512 0zM384 64V224C384 229.9 382.4 235.7 379.3 240.8L330.5 320H501.5L452.7 240.8C449.6 235.7 448 229.9 448 224V64H384z"/></svg>"""
		else -> null
	}
	
}
