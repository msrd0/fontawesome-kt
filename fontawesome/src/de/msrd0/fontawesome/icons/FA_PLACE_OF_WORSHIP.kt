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

/** Place of Worship */
object FA_PLACE_OF_WORSHIP: Icon {
	
	override val name get() = "Place of Worship"
	
	override val unicode get() = "f67f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M233.4 86.63L308.7 11.32C314.9 5.067 325.1 5.067 331.3 11.32L406.6 86.63C412.6 92.63 416 100.8 416 109.3V217.6L456.7 242C471.2 250.7 480 266.3 480 283.2V512H384V416C384 380.7 355.3 352 319.1 352C284.7 352 255.1 380.7 255.1 416V512H159.1V283.2C159.1 266.3 168.8 250.7 183.3 242L223.1 217.6V109.3C223.1 100.8 227.4 92.63 233.4 86.63H233.4zM24.87 330.3L128 273.6V512H48C21.49 512 0 490.5 0 464V372.4C0 354.9 9.53 338.8 24.87 330.3V330.3zM592 512H512V273.6L615.1 330.3C630.5 338.8 640 354.9 640 372.4V464C640 490.5 618.5 512 592 512V512z"/></svg>"""
		else -> null
	}
	
}
