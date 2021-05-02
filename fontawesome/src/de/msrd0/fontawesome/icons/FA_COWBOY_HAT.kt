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

object FA_COWBOY_HAT: Icon {
	
	override val name get() = "Cowboy Hat"
	
	override val unicode get() = "f8c0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M490 296.9C480.51 239.51 450.51 64 392.3 64c-14 0-26.49 5.93-37 14a58.21 58.21 0 0 1-70.58 0c-10.51-8-23-14-37-14-58.2 0-88.2 175.47-97.71 232.88C188.81 309.47 243.73 320 320 320s131.23-10.51 170-23.1zm142.9-37.18a16 16 0 0 0-19.75 1.5c-1 .9-101.27 90.78-293.16 90.78-190.82 0-292.22-89.94-293.24-90.84A16 16 0 0 0 1 278.53C1.73 280.55 78.32 480 320 480s318.27-199.45 319-201.47a16 16 0 0 0-6.09-18.81z"/></svg>"""
		else -> null
	}
	
}
