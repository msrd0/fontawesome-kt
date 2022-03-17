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

object FA_G: Icon {
	
	override val name get() = "G"
	
	override val unicode get() = "47"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M448 256c0 143.4-118.6 222.3-225 222.3c-132.3 0-222.1-106.2-222.1-222.4c0-124.4 100.9-223.9 223.1-223.9c84.84 0 167.8 55.28 167.8 88.2c0 18.28-14.95 32-32 32c-31.04 0-46.79-56.16-135.8-56.16c-87.66 0-159.1 70.66-159.1 159.8c0 34.81 27.19 158.8 159.1 158.8c79.45 0 144.6-55.1 158.1-126.7h-134.1c-17.67 0-32-14.33-32-32s14.33-31.1 32-31.1H416C433.7 224 448 238.3 448 256z"/></svg>"""
		else -> null
	}
	
}
