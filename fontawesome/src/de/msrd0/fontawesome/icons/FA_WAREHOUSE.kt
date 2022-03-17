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

/** Warehouse */
object FA_WAREHOUSE: Icon {
	
	override val name get() = "Warehouse"
	
	override val unicode get() = "f494"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M0 488V171.3C0 145.2 15.93 121.6 40.23 111.9L308.1 4.753C315.7 1.702 324.3 1.702 331.9 4.753L599.8 111.9C624.1 121.6 640 145.2 640 171.3V488C640 501.3 629.3 512 616 512H568C554.7 512 544 501.3 544 488V223.1C544 206.3 529.7 191.1 512 191.1H128C110.3 191.1 96 206.3 96 223.1V488C96 501.3 85.25 512 72 512H24C10.75 512 0 501.3 0 488zM152 512C138.7 512 128 501.3 128 488V432H512V488C512 501.3 501.3 512 488 512H152zM128 336H512V400H128V336zM128 224H512V304H128V224z"/></svg>"""
		else -> null
	}
	
}
