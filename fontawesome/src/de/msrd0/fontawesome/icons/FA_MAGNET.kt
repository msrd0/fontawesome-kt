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

object FA_MAGNET: Icon {
	
	override val name get() = "magnet"
	
	override val unicode get() = "f076"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M164.07 148.1H12a12 12 0 0 1-12-12v-80a36 36 0 0 1 36-36h104a36 36 0 0 1 36 36v80a11.89 11.89 0 0 1-11.93 12zm347.93-12V56a36 36 0 0 0-36-36H372a36 36 0 0 0-36 36v80a12 12 0 0 0 12 12h152a11.89 11.89 0 0 0 12-11.9zm-164 44a12 12 0 0 0-12 12v52c0 128.1-160 127.9-160 0v-52a12 12 0 0 0-12-12H12.1a12 12 0 0 0-12 12.1c.1 21.4.6 40.3 0 53.3 0 150.6 136.17 246.6 256.75 246.6s255-96 255-246.7c-.6-12.8-.2-33 0-53.2a12 12 0 0 0-12-12.1z"/></svg>"""
		else -> null
	}
	
}
