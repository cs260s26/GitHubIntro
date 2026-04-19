# GitHub Intro

This repository is for an in-class activity to introduce you to GitHub pull
requests. You will make a contribution to this repository in the form of a pull
request, and also see how the pull request can be updated with an additional
change.

## GitHub Workflow

When contributing to an open source project on GitHub that allows community
contributions, one does not push changes directly to the main
repository. Instead, each developer creates a *fork* of the repository, pushes
their changes to their fork, and then requests that those changes be merged
into the main repository via a *pull request*. For many open source projects,
the maintainers will consider merging a well written pull request from anyone,
including you!

## Setting Up SSH Keys

To push changes to GitHub from the command line, you will first need to set up
SSH keys. See
[this guide](https://canvas.xavier.edu/courses/101593/pages/github-ssh-keys) on
Canvas for instructions.

## Fork and Clone

Fork this repository by clicking the "Fork" button towards the upper right
corner of this page on GitHub. **When creating the new fork, make sure that you
choose your username as the owner of the repository.** This creates a copy of
the repository under your GitHub account. Generally you only do this step once
for any given repository that you want to contribute to.

Now you can clone your fork to your computer. This works just like cloning from
git-keeper, but here you get the clone URL from GitHub. On the page for your
fork (**make sure you are in your fork and not the original repository by
looking at the URL in the address bar which should contain your username and 
*not* cs260s26**) click the green "Code" button, and **make sure to select 
SSH**. Copy the URL, and then clone the repository as you would a git-keeper
assignment. The repository contains Markdown files and Java code, so you can
open the repository in IntelliJ.

## Adding Changes to `contributors.md`

In your local clone, add your name to the file `contributors.md`. Put your name
at the bottom, and be sure there is an asterisk (`*`) in front of your name,
because that is how bulleted lists are written in Markdown. Commit your
changes, and push. Now go back to your fork on GitHub and just above the list
of files you should see a message that your branch is 1 commit ahead of the
repository that you forked from, and to the right of that should be a
"Contribute" button. Click on "Contribute" and select "Open pull request". This
takes you to a page where you can review the changes you have made. You should
see that `contributors.md` was modified and that your name was added. If
everything looks good, click on "Create pull request". On the next page you
should see the title of the pull request filled in with the contents of your
commit message.

Now I would be able to merge your changes into the main repository.

## Adding Changes to the Java Code

Before a pull request is merged, you can push additional commits which
automatically updates the pull request. This is useful if you forgot to add a
file's changes, or if someone reviewed your pull request and then asked you to
fix something before merging.

Try updating your pull request by making a second change, this time to the
Java program. This is a very simple "magic 8-ball" program which prints a
random string that answers a yes or no question. Try running it to see how it
works.

Add at least one additional string to the list of strings in the Main class.
Run the program a few times to make sure it still works and that your string
eventually gets printed. When you are satisfied with your change, commit and
push again. Go back to GitHub and refresh the page for your pull request, and
you should see that it has been updated with your additional change.

That's it!

----------

If contributing to an open source project sounds exciting, you could try it
over break! **This is completely optional, and might be a lot of work.** Keep
in mind that you might not be successful. Even if you do not end up making a
successful contribution, exploring a project can still be a rewarding
experience. Below is a site with good resources for getting started making your
first contribution, feel free to reach out to me for advice as well.

[https://www.firsttimersonly.com/](https://www.firsttimersonly.com/)
