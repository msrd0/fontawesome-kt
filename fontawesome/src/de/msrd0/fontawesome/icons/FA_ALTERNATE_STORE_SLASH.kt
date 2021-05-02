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

object FA_ALTERNATE_STORE_SLASH: Icon {
	
	override val name get() = "Alternate Store Slash"
	
	override val unicode get() = "e070"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M17.89,123.62,5.51,142.2c-14.2,21.3,1,49.8,26.59,49.8h74.26ZM576,413.42V224H512V364L384,265V224H330.92l-41.4-32H608c25.5,0,40.7-28.5,26.59-49.8l-85.29-128A32.18,32.18,0,0,0,522.6,0H117.42A31.87,31.87,0,0,0,90.81,14.2l-10.66,16L45.46,3.38A16,16,0,0,0,23,6.19L3.37,31.46A16,16,0,0,0,6.18,53.91L594.53,508.63A16,16,0,0,0,617,505.81l19.64-25.26a16,16,0,0,0-2.81-22.45ZM320,384H128V224H64V480a32,32,0,0,0,32,32H352a32,32,0,0,0,32-32V406.59l-64-49.47Z"/></svg>"""
		else -> null
	}
	
}
