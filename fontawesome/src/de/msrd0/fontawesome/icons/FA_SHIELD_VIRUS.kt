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

object FA_SHIELD_VIRUS: Icon {
	
	override val name get() = "Shield Virus"
	
	override val unicode get() = "e06c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M224,192a16,16,0,1,0,16,16A16,16,0,0,0,224,192ZM466.5,83.68l-192-80A57.4,57.4,0,0,0,256.05,0a57.4,57.4,0,0,0-18.46,3.67l-192,80A47.93,47.93,0,0,0,16,128C16,326.5,130.5,463.72,237.5,508.32a48.09,48.09,0,0,0,36.91,0C360.09,472.61,496,349.3,496,128A48,48,0,0,0,466.5,83.68ZM384,256H371.88c-28.51,0-42.79,34.47-22.63,54.63l8.58,8.57a16,16,0,1,1-22.63,22.63l-8.57-8.58C306.47,313.09,272,327.37,272,355.88V368a16,16,0,0,1-32,0V355.88c0-28.51-34.47-42.79-54.63-22.63l-8.57,8.58a16,16,0,0,1-22.63-22.63l8.58-8.57c20.16-20.16,5.88-54.63-22.63-54.63H128a16,16,0,0,1,0-32h12.12c28.51,0,42.79-34.47,22.63-54.63l-8.58-8.57a16,16,0,0,1,22.63-22.63l8.57,8.58c20.16,20.16,54.63,5.88,54.63-22.63V112a16,16,0,0,1,32,0v12.12c0,28.51,34.47,42.79,54.63,22.63l8.57-8.58a16,16,0,0,1,22.63,22.63l-8.58,8.57C329.09,189.53,343.37,224,371.88,224H384a16,16,0,0,1,0,32Zm-96,0a16,16,0,1,0,16,16A16,16,0,0,0,288,256Z"/></svg>"""
		else -> null
	}
	
}
